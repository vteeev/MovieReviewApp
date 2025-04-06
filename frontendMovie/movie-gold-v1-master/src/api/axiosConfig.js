import axios from 'axios';

export default axios.create({
    baseURL:'https://d4c1-84-40-153-221.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});