import fetch from 'unfetch'

const checkStatus = response => {
    if (response.ok) {
        return response;
    } else {
        let error = new Error(response.statusText);
        error.response = response;
        response.json().then(e => {
            error.error = e;
        });
        return Promise.reject(error);
    }
}

const getAllOrders=() =>
    fetch('api/orders').then(checkStatus())