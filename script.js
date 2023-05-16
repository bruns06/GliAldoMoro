const express = require('express');
const app = express();
const port = 3000;

app.use(express.urlencoded({ extended: true }));

app.get('/', (req, res) => {
  res.sendFile(__dirname + '/index.html');
});

app.post('/submit', (req, res) => {
  const text = req.body.text;
  console.log(`Testo inserito: ${text}`);
  res.send('Dati inviati correttamente!');
});

app.listen(port, () => {
  console.log(`Server in ascolto sulla porta ${port}`);
});

function test(){
    document.getElementById("myForm").reset();
}



