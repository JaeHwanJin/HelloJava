fetch('./MemberListServlet')
    .then( result => result.json())
    .then(listShow)
    .catch( error => console.error(error));

function listShow(data = []){
    data.forEach(member => {
        if(member.responsibility == 'admin')
            console.log(member);
    })	

	// 권한이 user인 사람들만 userGroup
	let userGroup = [];
	
	// forEach를 사용하면
	data.forEach(member => {
        if(member.responsibility == 'user')
            userGroup.push(member);
	})
	
	// filter를 사용하면
	userGroup = data.filter(member => member.responsibility = 'user');
}


