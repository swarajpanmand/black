const express = require('express')
const path = require('path')

const app = express()


app.use(express.static('./'));

app.get('/', (req, res) => {
    res.sendFile(path.resolve(__dirname, 'index.html'));
});

app.all('*', (req, res) => {
    res.send('Website under construction');
});

app.listen(5000, () => {
    console.log('Server is running on port 5000');
});
