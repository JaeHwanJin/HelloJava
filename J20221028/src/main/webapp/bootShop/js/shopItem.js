// shopItem.js

fetch('../ShopItemListServlet')
.then( result => result.json())
.then( itemListShow)
.catch( err => console.error(err));

function itemListShow(result){

    result.forEach(item => {
        makeItemDiv(item);
    });
    
}

function makeItemDiv(item ={}){

    let template = document.querySelector('#template>div') // template 밑 div 태그를 모두 가져옴
    let good = template.cloneNode(true); //clonNode 
    good.querySelector('h5').textContent= item.itemName;
    good.querySelector('img.card-img-top').src = '../images/' + item.image;
    good.querySelector('span.text-muted').textContent = item.originPrice;
    good.querySelector('span.text-muted').nextSibling.textContent = item.salePrice;
    //good.querySelector('span.badge').textContent = 1;
	//good.querySelector('span.text-mute').textContent = item.salePrice;
	
	// reivew
    let reivew = item.likeIt; // 4.5
    let a = Math.floor(reivew); // 온쪽
    let b = reivew - a; 
	for(let i = 0; i < a; i++){
        let div = document.createElement('div');
        div.className = 'bi-star-fill'; 
        good.querySelector('div.d-flex').append(div);
    }
    if(b){
        let div = document.createElement('div');
        div.className = 'bi-star-half';
        good.querySelector('div.d-flex').append(div);
    }
	
	// 장바구니 수량 변경
	
	
    // 목록
    let parent = document.querySelector('section.py-5>div>div');
    parent.append(good);
    console.log(good);

}
