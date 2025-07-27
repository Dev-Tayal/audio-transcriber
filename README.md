🎷 Audio to Text Transcriber 

A full-stack application that transcribes spoken audio into text using OpenAI’s Whisper API. Built with React, Spring Boot, and Spring AI. 

🛠️ Tech Stack 

- Frontend: React.js 

- Backend: Spring Boot (Java), Spring AI 

- Transcription API: OpenAI Whisper 

- Styling: CSS (custom styles with centered flex layout) 

✨ Features 

- 🎙 Upload any audio file (e.g. .mp3, .wav) 

- 🔮 Uses OpenAI’s Whisper model for accurate transcription 

- 📃 Displays transcribed text inside a styled result box 

- 📱 Responsive and visually aesthetic UI 

🖼️ UI Snapshot 

The app features a central glowing box with a gradient background, large input and button controls, and a scroll-free expanding layout for large transcriptions. 

📂 Folder Structure 

/client 
  └── src/ 
      └── AudioTranscribe.jsx 
      └── App.jsx 
      └── index.css 
/server 
  └── src/ 
      └── controller/ 
      └── service/ 
      └── main/ 
 

⚙️ How to Run 

Backend (Spring Boot) 

1. Add your OpenAI API key in application.properties: 
   spring.ai.openai.api-key=YOUR_API_KEY 
2. Run the Spring Boot app: 
   ./mvnw spring-boot:run 
 

Frontend (React) 

1. Navigate to the client folder and install dependencies: 
   npm install 
2. Start the app: 
   npm start 
 

📦 Dependencies 

- spring-ai-starter-openai 

- axios 

- react 

✨ UI Styling Highlights 

html, body { 
  background: linear-gradient(135deg, #0f0c29, #302b63, #24243e); 
  display: flex; 
  justify-content: center; 
  align-items: center; 
} 
 
.App { 
  background-color: #0a0122aa; 
  box-shadow: 0 0 40px rgba(0, 0, 255, 0.5); 
  border-radius: 20px; 
  padding: 1.5em; 
  display: flex; 
  flex-direction: column; 
  transition: all 0.3s ease-in-out; 
} 
 

📌 To Do 

- [ ] Add support for longer audio uploads 

- [ ] Add loading indicator 

- [ ] Export transcription to .txt 

🧠 Inspiration 

This project demonstrates the power of AI for speech-to-text conversion and is ideal for use cases like: 

- Meeting transcriptions 

- Voice notes 

- Podcasts and interviews 
