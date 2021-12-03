import "./UserManagement.css";
import React, { useState } from 'react';
import TextField from '@mui/material/TextField';
import Button from "@mui/material/Button";
import Stack from '@mui/material/Stack';

export default function UserManagement(){
    const [search, setSearch] = useState("");

    function handleSubmit(e){
        e.preventDefault();
    }

    return(
        <div className='UserManagement'>
            <h1>
                Users:
            </h1>
            <form onSubmit={handleSubmit}>
                <div className="SearchUserBox">
                <TextField 
                    id="outlined-Search" 
                    label="Search" 
                    variant="outlined"
                    size="small"
                    value={search}
                    onChange={(e) => setSearch(e.target.value)} 
                />
                <Button variant="contained" type='submit'>Search</Button>
                </div>
                <div className="UserButtons">
                <Stack spacing={2} direction="row">
                    <Button variant="outlined" >Add User</Button>
                    <Button variant="outlined" >Remove User</Button>
                    <Button variant="outlined" >Block User</Button>
                    <Button variant="outlined" >Edit User</Button>
                </Stack>
                </div>  
            </form>
        </div>
    );
}