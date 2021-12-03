import Box from "@mui/material/Box";
import {TextField} from "@mui/material";
import Button from "@mui/material/Button";
import AnimalLists from "./animalLists";
import * as React from "react";

export default function SearchAnimal() {

    return(
        <div>
            <Box
                component="form"
                sx={{
                    '& > :not(style)': { m: 1, width: '25ch' },
                }}
                noValidate
                autoComplete="off"
            >
                <div>Search Animal</div>
                <TextField id="outlined-basic" label="Outlined" variant="outlined" />
                <TextField id="filled-basic" label="Filled" variant="outlined" />
                <TextField id="standard-basic" label="Standard" variant="outlined" />
                <Button size="large" variant="contained">View animal profile</Button>
            </Box>

            <AnimalLists />

            <Button size="large" variant="contained">Add a new animal</Button>
        </div>
    );
}