import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Hello = () => {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetchMessage();
  }, []);

  const fetchMessage = async () => {
    try {
      const response = await axios.get('http://localhost:8080/api/hello');
      setMessage(response.data);
    } catch (error) {
      console.error('Failed to fetch message:', error);
    }
  };

  return (
    <div>
      <h1>{message}</h1>
    </div>
  );
};

export default Hello;