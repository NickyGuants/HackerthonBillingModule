import logo from './logo.svg';
import './App.css';
import React, { Component} from "react";
import PatientList from "./PatientList";
import { Checkbox} from 'semantic-ui-react';


class App extends Component{
    state={
        isLoading:true,
        orders: [],
        selections: {}
    };

    async componentDidMount(){
        const response = await fetch('/api/orders');
        const body = await response.json();
        this.setState({orders: body, isLoading: false});
    }

    render(){
        const { orders, isLoading} =this.state;

        if (isLoading){
            return <p>Loading...</p>
        }

        return (
            <div>
                <h1>Patient Id: 20001</h1>
                <p>Patient Name: Alex Waweru</p>
                <p>Gender: Male</p>
                <p>Category: Insurance</p>
                <h1> Orders</h1>
                <table id="orders">
                    <tbody>
                    <tr>{this.renderTableHeader()}</tr>
                    {this.renderTableData()}
                    </tbody>
                </table>
                <table id="Amount">
                    <tbody>
                    {this.renderTableTotal()}
                    {this.renderTableInsurance()}
                    {this.renderTableCash()}
                    </tbody>
                </table>
                <button>Save Bill</button>
            </div>
        )
    }

    renderTableData() {
        return this.state.orders.map((order) =>{
            const { id, orderId, selected,service, quantity,pay, payableByInsurance, unitPrice, itemTotal} =order
            return(
                <tr key={id}>
                    <td>{id}</td>
                    <td>{orderId}</td>
                    <td><Checkbox>{selected}</Checkbox></td>
                    <td>{service}</td>
                    <td>{quantity}</td>
                    <td><Checkbox>{pay}</Checkbox></td>
                    <td><Checkbox>{payableByInsurance}</Checkbox></td>
                    <td>{unitPrice}</td>
                    <td>{itemTotal}</td>
                </tr>


            )
        })
    }

    renderTableHeader() {
        let header = Object.keys(this.state.orders[0])
        return header.map((key, index) => {
            return <th key={index}>{key.toUpperCase()}</th>
        })
    }

    renderTableTotal() {
        return (
            <tr>
                <td>Total Amount</td>
                <td>{3100}</td>
            </tr>
        )

    }

    renderTableInsurance() {
        return (
            <tr>
                <td>Amount Awarded by Insurance</td>
                <td>{2500}</td>
            </tr>
        )
    }

    renderTableCash() {
        return (
            <tr>
                <td>Amount to be Paid in Cash</td>
                <td>{600}</td>
            </tr>
        )

    }
}


export default App;
