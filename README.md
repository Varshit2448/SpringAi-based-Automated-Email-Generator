
# SpringAI Email Assistant

An intelligent email assistant that generates context-aware email replies automatically using **Spring AI**. This Spring Boot application reads incoming emails and produces replies in a friendly, professional, or neutral tone.

---

## Features

- Automatically generates email replies based on incoming content.  
- Supports multiple tones: **Friendly**, **Professional**, **Neutral**.  
- Built with **Spring Boot** and **Spring AI**.  
- Easily integrates with a browser extension for quick email generation.  

---

## Tech Stack

- **Backend:** Java, Spring Boot, Spring AI, WebClient  
- **Frontend (Extension):** JavaScript, HTML, CSS  
- **Tools:** Maven, Lombok, Spring WebFlux  

---

## Getting Started

### Prerequisites

- Java 17+  
- Maven 3+  
- Node.js and npm (for extension)  

### Backend Setup

1. Clone the repository:  
```bash
git clone https://github.com/yourusername/springai-email-assistant.git
cd springai-email-assistant
```

2. Configure `application.properties` with your Spring AI API details:  
```properties
gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent
gemini.api.key=YOUR_API_KEY
```

3. Build and run the backend:  
```bash
mvn clean install
mvn spring-boot:run
```

The backend runs at `http://localhost:8080`.

---

### Integrating the Browser Extension

1. Go to the `extension` folder in the project.  
2. Load the extension in your browser:  
   - **Chrome:** `chrome://extensions/` → Enable **Developer mode** → **Load unpacked** → Select the `extension` folder  
   - **Edge:** `edge://extensions/` → Enable **Developer mode** → **Load unpacked** → Select the `extension` folder  

The extension communicates with your backend to generate email replies directly from the browser.

---

## Usage

1. Open your email client with the extension enabled.  
2. Click **SpringAI** in the toolbar.  
3. Select the tone and generate a reply automatically.  

---

## Contributing

Contributions are welcome! Submit a PR or open an issue for bugs or feature requests.  

---

## License

Unlicense License  

---


