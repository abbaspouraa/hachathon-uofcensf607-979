
import { AppBar, Toolbar, Typography, makeStyles, Button } from "@material-ui/core";
import React from "react";
import { Link, Link as RouterLink } from "react-router-dom";

const headersData = [
  {
    label: "Listings",
    href: "/listings",
  },
  {
    label: "Mentors",
    href: "/mentors",
  },
  {
    label: "My Account",
    href: "/account",
  },
  {
    label: "Log Out",
    href: "/logout",
  },
];


const useStyles = makeStyles(() => ({
  header: {
    backgroundColor: "#400CCC",
  },
  logo: {
    fontFamily: "Work Sans, sans-serif",
    fontWeight: 600,
    color: "#FFFEFE",
    textAlign: "left",
  },
}));

export default function Header() {
  const { header, logo } = useStyles();

  const displayDesktop = () => {
    return (
      <Toolbar>
      {schoolLogo} 
      </Toolbar>
      );
  };

  const schoolLogo = (
    <Typography variant = "h6" component = "h1">
      Faculty of Veterinary Medicine
    </Typography>
  );

  
  return (
    <div>
      <header>
        <AppBar className={header}>
          {displayDesktop()} 
        </AppBar>
      </header>

    </div>
    
  );
}


