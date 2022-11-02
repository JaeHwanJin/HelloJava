// covid.js

window.onload = function(){
    // request url
    let url =
     "https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=284&returnType=JSON&serviceKey=XCbEpE%2BN8BpLOKKOlgL1YGY8MrY9qDUE0IZI6aZbNfo8LQubZI5V4OLCKRcJXlLgLzWjzmRnoPc8uZ05lpiAjg%3D%3D";
		
		fetch(url)
			.then(result => result.json()) // json -> object
			.then(showList)
			.catch(error => console.log(error));
		document.querySelector('#findBtn').addEventListener('click', findCenterList);
}

let titles = {
	id : '센터아이디',
	centerName : '센터명',
	phoneNumber : '연락처',
	lat : '위도',
	lng : '경도'
};

function showList(result){
	// 타이틀 생성부분
	makeHead();
	
	// body 영역 생성, 데이터 초기화
    console.log(result);
	data = result.data;
	
	// option 태그 생성
	makeOption(data);

	let selectedCity = data.filter(center => center.sido == '서울특별시')
	makeList(selectedCity);	
}

function makeOption(ary =[]){
	// select태그 생성
	let sidoAry =[];  
	data.forEach(center => {
		if(sidoAry.indexOf(center.sido) == -1){
			sidoAry.push(center.sido);
		}
	});
	let cityList = document.getElementById('city');
	sidoAry.forEach(sido =>{
		let option = document.createElement('option');
		option.value = sido;
		option.textContent = sido;
		cityList.append(option);
	});
}


function findCenterList(){
	let searchKey = document.querySelector('#city').value;
	let searchAry = data.filter(center => center.sido == searchKey);
	makeList(searchAry);
}

function makeList(ary = []){
	// 화면에 tr이 있으면 tr삭제
	document.querySelectorAll('#list>tr').forEach(tr => tr.remove());
	let list = document.getElementById('list');
	ary.forEach(center => {
		list.append(makeTr(center));
	});
	
	document.querySelectorAll('#list>tr').forEach((tr, idx) => {
		let td = document.createElement('td');
		td.textContent = idx + 1;
		tr.prepend(td); // append(): 마지막위치에 추가. prepend(): 처음위치에 추가
	})
}


function makeTr(row = {}){
	let tr = document.createElement('tr');
	tr.setAttribute('lng', row.lng);
	tr.setAttribute('lat', row.lat);
	tr.addEventListener('click', openInfoWindow);
	// td생성
	for(let field in titles){
		let td = document.createElement('td');
		let txt = document.createTextNode(row[field]);
		td.appendChild(txt)
		tr.appendChild(td);
	}
	return tr;
}

function openInfoWindow(e){
	console.log(e.target.parentElement); // tr lng, lat
	let lng = e.target.parentElement.getAttribute('lng');
	let lat = e.target.parentElement.getAttribute('lat');
	
	window.location.href = 'infoWindow.html?x='+lng+'&y='+lat;
	
}

function makeHead(){
	// 타이틀
	let tr = document.createElement('tr');
	let th = document.createElement('th');
	th.textContent = '순번';
	tr.appendChild(th);
	for(let title in titles){
		let th = document.createElement('th');
		let txt = document.createTextNode(titles[title]);
		th.appendChild(txt);
		tr.appendChild(th);		
	}
	document.getElementById('title').append(tr);
}