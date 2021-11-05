import Dashboard from "pages/Dashboard/Index";
import Home from "pages/Home/Index";
import { Route } from "react-router";
import { BrowserRouter } from "react-router-dom";


const Routes = () => {
    return (
        <BrowserRouter>
            <switch>
                <Route path="/" >
                    <Home />
                </Route>
                <Route path="/dashboard" >
                    <Dashboard />
                </Route>

            </switch>
        </BrowserRouter>
    );
}

export default Routes;
