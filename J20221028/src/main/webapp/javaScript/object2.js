/**
 * 
 */

document.addEventListener('DOMContentLoaded', function(){
	// document.getElementById('show').innerHTML = '<p>Hello, World</p>';  
	let data = `[{"id":1,"first_name":"Andrew","last_name":"Denney","email":"adenney0@zdnet.com","gender":"Male","slary":2499},
{"id":2,"first_name":"Vitia","last_name":"Makeswell","email":"vmakeswell1@gravatar.com","gender":"Female","slary":5788},
{"id":3,"first_name":"Dominique","last_name":"Ferroni","email":"dferroni2@jimdo.com","gender":"Polygender","slary":9956},
{"id":4,"first_name":"Michaeline","last_name":"Volett","email":"mvolett3@apple.com","gender":"Female","slary":3544},
{"id":5,"first_name":"Sari","last_name":"Chasles","email":"schasles4@hatena.ne.jp","gender":"Female","slary":1529},
{"id":6,"first_name":"Rivkah","last_name":"Wysome","email":"rwysome5@paypal.com","gender":"Female","slary":7877},
{"id":7,"first_name":"Fletch","last_name":"Barneville","email":"fbarneville6@constantcontact.com","gender":"Male","slary":8565},
{"id":8,"first_name":"Emmy","last_name":"Dreher","email":"edreher7@ameblo.jp","gender":"Female","slary":7742},
{"id":9,"first_name":"Emmy","last_name":"Hanshawe","email":"ehanshawe8@theatlantic.com","gender":"Male","slary":8542},
{"id":10,"first_name":"Fianna","last_name":"Ewdale","email":"fewdale9@sohu.com","gender":"Female","slary":8304}]`;


// json 타입 => javascript 오브젝트 타입으로 변환  

const fields = ['id', 'first_name', 'last_name', 'email', 'salary'];
let ulTag = document.createElement('table');

for (row of result){
	ulTag.appendChild(makeTr(row));
}

document.getElementByID('show').appendChild(ulTag);

function makeTr(obj){

		
}

function makeList(obj){
	let liTag = document.createElement('li');
	let str = '';
	for(field of fields){
		str+= `$(field) : ${obj[field]}`;
	}
	
	let txt = document.createTextNode(str);
	liTag.appendChild(txt);
	
	return liTag;
	
	}


});



