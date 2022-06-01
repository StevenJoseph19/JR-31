import React from "react";
import { BrowserRouter as Router, Switch, Route, Redirect } from "react-router-dom";
import SignInComponent from "./SignInComponent";
import SignUpComponent from "./SignUpComponent";

class RootComponent extends React.Component {
  
  render() {
       return (
        <Router>
          <Switch>
            <Route
              exact
              path={"/signin"}
              render={() => {
                return <SignInComponent />;
              }}
            />
            <Route
              exact
              path={"/signup"}
              render={() => {
                return <SignUpComponent />;
              }}
            />
          </Switch>
        </Router>
      ); 
    }
  }

export default RootComponent;
