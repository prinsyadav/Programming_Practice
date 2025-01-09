import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import './App.css'

function App() {
  return (
    <>
      <table
        // style={{
        //   placeItems: "center",
        //   backgroundColor: "coral",
        //   borderRadius: "1%",
        //   alignItems: "flex-start",
        //   padding: "1%",
        //   margin: "1%",
        //   // border: "2px solid red",
        // }}
      >
        <thead
          // style={{
          //   border: "2px solid green",
          //   // borderRadius: "20px",
          // }}
        >
          <tr>
            <th>Song</th>
            <th>Artist</th>
            <th>Year</th>
          </tr>
        </thead>
        <tbody
          // style={{
          //   placeContent: "center",
          //   border: "2px solid green",
          //   // borderRadius: "20px",
          // }}
        >
          <tr>
            <td>The Sliding Mr. Bones (Next Stop, Pottersville)</td>
            <td>Malcolm Lockyer</td>
            <td>1961</td>
          </tr>
          <tr>
            <td>Witchy Woman</td>
            <td>The Eagles</td>
            <td>1972</td>
          </tr>
          <tr>
            <td>Shining Star</td>
            <td>Earth, Wind, and Fire</td>
            <td>1975</td>
          </tr>
        </tbody>
      </table>
    </>
  );
}

export default App;
