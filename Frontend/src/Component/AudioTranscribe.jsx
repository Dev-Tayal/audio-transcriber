import React,{useState} from 'react';
import axios from 'axios';

function AudioTranscribe(){
    const[file, setFile]= useState('');
    const[output, setOutput]= useState('');

    const uploadHandle= (e)=>{
        setFile(e.target.files[0]);
    }
    const generateHandle= async()=>{

        const formData= new FormData();
        formData.append('file', file);
        try{
            const response= await axios.post('http://localhost:8080/audio/transcribe',formData,{
                headers :{
                    'Content-Type': 'multipart/form-data'
                }
            });
            setOutput(response.data);
        }
        catch(error){
            console.log("Error in generating ",error);
        }
    } 
    return(
        <div className='container'>
            <h1>🎧 Audio to Text Transcriber</h1>
            <div className= 'file-input'>
                <input type='file'
                 accept='audio/*'
                 onChange={uploadHandle} />
            </div>
            <br></br>
            <button onClick={generateHandle}>🔮Upload and Transcribe</button>
            <div className='result'>
                <h2>Transcription Result</h2>
                <p>{output}</p>
            </div>
        </div>
    );
}
export default AudioTranscribe;