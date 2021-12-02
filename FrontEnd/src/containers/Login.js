import React, { useState } from 'react';
import "./Login.css";
import TextField from '@mui/material/TextField';
import Button from "@mui/material/Button";
import Box from '@mui/material/Box';

export default function Login(){
    const [UCID, setUCID] = useState("");
    const [password, setPassword] = useState("");

    function validate(){
        return UCID.length > 0 && password.length > 0;
    }

    function handleSubmit(e){
        e.preventDefault();
    }

    return (
        <div className="Login">
            <h1>
                University of Calgary <br></br>
                School of Veterinary Medicine <br></br>
            </h1>
            <h3>Animal Management Application</h3>
            <form onSubmit={handleSubmit}>
                <TextField 
                    required
                    id="outlined-UCID" 
                    label="UCID" 
                    variant="outlined"
                    value={UCID}
                    onChange={(e) => setUCID(e.target.value)} 
                />
                <TextField 
                    required
                    id="outlined-password" 
                    label="Password" 
                    variant="outlined"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)} 
                />
                <br></br>
                <Button classname="loginButton" variant="contained" type='submit'>Sign in</Button>
            </form>

        </div>

    );
}