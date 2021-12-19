import "./Home.css";
import AdminHome from "../components/cameron/AdminHome"

export default function Home({token}){

    return(
        <div> {token.token === "Admin" && <AdminHome />}</div>
    );
}