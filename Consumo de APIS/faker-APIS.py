from flask import Flask, jsonify
import requests

app = Flask(__name__)

@app.route('/persona', methods=['GET'])
def get_user():
    url = 'https://fakerapi.it/api/v2/persons?_quantity=1&_gender=female&_birthday_start=2005-01-01'
    response = requests.get(url)

    if response.status_code == 200:
        return jsonify(response.json())
    else:
        return jsonify({'error': 'No se pudieron obtener los datos'}), 500
    

@app.route('/tarjeta', methods=['GET'])
def get_card():
    url = 'https://fakerapi.it/api/v2/creditCards?_quantity=1'
    response = requests.get(url)

    if response.status_code == 200:
        return jsonify(response.json())
    else:
        return jsonify({'error': 'No se pudieron obtener los datos'}), 500
    

@app.route('/address', methods=['GET'])
def get_address():
    url = 'https://fakerapi.it/api/v2/addresses?_quantity=1'
    response = requests.get(url)

    if response.status_code == 200:
        return jsonify(response.json())
    else:
        return jsonify({'error': 'No se pudieron obtener los datos'}), 500
    
if __name__ == '__main__':
    app.run(debug=True)