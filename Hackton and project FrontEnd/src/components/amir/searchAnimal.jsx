import Box from "@mui/material/Box";
import {setRef, TextField} from "@mui/material";
import Button from "@mui/material/Button";
import * as React from "react";
import {useEffect, useRef, useState} from "react";
import AnimalService from "../service/AnimalService";
import axios from "axios";
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell, {tableCellClasses} from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import AnimalProfile from "./animalProfile";


export default function SearchAnimal() {

    const [name, setName] = useState("0");
    const [species, setSpecies] = useState("0");
    const [sex, setSex] = useState("0")

    const [error, setError] = useState(null);
    const [items, setItems] = useState([]);


    useEffect(() => {
        // getAllAnimals();
       searchAnimals();
    }, [])

    const searchAnimals = () => {
        AnimalService.getSearchAnimal(name, species, sex).then((response) => {
            setItems(response.data)
        }).catch(error =>{
            console.log(error);
        })
    }

    const getAllAnimals = () => {
        AnimalService.getAllAnimal().then((response) => {
            setItems(response.data)
            console.log(response.data);
        }).catch(error =>{
            console.log(error);
        })
    }

    const [id, setId] = useState("");


    const reserveAnimal = (id) => {
        if (id)
            AnimalService.updateAnimalStatus(id, "Requested").then((response) => {

        }).catch(error =>{
            console.log(error);
        })
    }

    const handleSubmit = (e) =>{
        e.preventDefault();

        // const fname = username;
        // const credentials = {username, password}
        // console.log(credentials);

        axios({
            method: 'post',
            url: 'http://localhost:8090/user/login',
            data: {
                // "fName" : username,
                // "password" : password
            }
        })
            .then((response) => {
                console.log(response.data);
                if(response.data != null){
                    // setToken(response.data)
                }
            });
    }


    if (error) {
        return <div>Error: {error.message}</div>;
    } else {
        return (
            <div>
                <Box
                    component="form"
                    sx={{
                        '& > :not(style)': {m: 1, width: '25ch'},
                    }}
                    noValidate
                    autoComplete="off"
                >
                    <div>Search Animal</div>

                    <TextField
                        id="outlined-basic"
                        label="Name"
                        value={name}
                        variant="outlined"
                        onChange={(event) => setName(event.target.value)}
                    />

                    <TextField
                        id="filled-basic"
                        label="Species"
                        value={species}
                        variant="outlined"
                        onChange={(event) => setSpecies(event.target.value)}
                    />

                    <TextField
                        id="standard-basic"
                        label="Sex"
                        value={sex}
                        variant="outlined"
                        onChange={(event) => setSex(event.target.value)}
                    />

                    <Button
                        size="large"
                        variant="contained"
                        onClick={() => searchAnimals()}
                    >Search</Button>
                </Box>

                {/*<AnimalLists />*/}
                <TableContainer component={Paper}>
                    <Table sx={{ minWidth: 650 }} aria-label="simple table">
                        <TableHead>
                            <TableRow>
                                <TableCell>Name</TableCell>
                                <TableCell align="right">Species</TableCell>
                                <TableCell align="right">Breed</TableCell>
                                <TableCell align="right">RFID</TableCell>
                                <TableCell align="right">Status</TableCell>
                                <TableCell align="right">Request animal</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {items.map((row) => (
                                <TableRow
                                    key={row.name}
                                    sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                                >
                                    <TableCell component="th" scope="row">
                                        {row.name}
                                    </TableCell>
                                    <TableCell align="right">{row.species}</TableCell>
                                    <TableCell align="right">{row.breed}</TableCell>
                                    <TableCell align="right">{row.rfid}</TableCell>
                                    <TableCell align="right">{row.status}</TableCell>

                                    <TableCell align="right">
                                        <Button
                                            size="small"
                                            variant="contained"
                                            onClick={() => reserveAnimal(row.animalid)}
                                        >request</Button>
                                    </TableCell>

                                </TableRow>
                            ))}
                        </TableBody>
                    </Table>
                </TableContainer>


                <Button size="large" variant="contained">Add a new animal</Button>
            </div>
        );
    }
}