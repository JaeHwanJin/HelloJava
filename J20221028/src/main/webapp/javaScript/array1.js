// array1.js
fetch('data/MOCK_DATA.json')
.then( result => result.json())
.then( composeFnc)
.catch( error => console.error(error));


function composeFnc(result = []){
	// 급여 5000넘는 사람들만 filter 한 후에 새로운 모임
	result.filter(row => row.salary > 5000)
		.map(row => {
			let team = {
				t_id : row.id,
					t_name : row.first_name + '/' + row.last_name
			}
			team.t_mail = row.email;
			team['t_dept'] = 'Accout';
			return team;
		})
		.forEach(team => console.log(team));
}

// Array.map() => A - A
function mappingFnc(result = []){
	let newAry = result.map( row => {
		let newObj = {}; // new Object();
		newObj.user_id = row.id;
		newObj.user_name = row.first_name + '-' + row.last_name;
		newObj.info = row.email;
		
		return newObj;
	});
	
	newAry.forEach(obj => console.log(obj));
} 


// Array.filter() = 매개함수의 반환값이 true인 요소들만 모아서 새로운 배열 생성
// SQL의 WHERE절과 비슷
function filterFnc(result = []){
	let oddAry = result.filter((row, idx) => row.salary > 5000)
		.forEach( row => console.log(row));

	//oddAry.forEach(row => console.log(row));
}

// Array.forEach() => 최종처리하는 기능을 구현
function showMain(result){
    console.log(result);
    result.forEach((row, idx) => {
		console.log(row)
        //if (row.gender == 'Female'){
        if (idx % 2 == 0){
            console.log(row.id, row.first_name, row.last_name);
        }
    });    
}

function sum(a=0, b=0){
	if(a){
		return a+0;
	}
	if(a && b){
		return a+b;
	}
}

console.log(sum(10));


