import { useState } from 'react'
import './App.css'
import AudioTranscribe from './Component/AudioTranscribe'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className='App'>
      <AudioTranscribe/>
    </div>
  )
}

export default App
