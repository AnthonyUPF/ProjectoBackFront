const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '9ab14386e0msh52499dac280a632p1826cejsn739c8d55d0a8',
		'X-RapidAPI-Host': 'genius-song-lyrics1.p.rapidapi.com'
	}
};

window.onload = function () {
fetch('https://genius-song-lyrics1.p.rapidapi.com/search/?q=%3CREQUIRED%3E&per_page=10&page=1', options)
	.then(response => response.json())
	.then((json)=>{
		console.log(JSON.stringify(json))
		for (let i =0; i < json.hits.length; i++) {
			const str = document.getElementById("start");
			const card = document.createElement("div");
			card.className = "col";

			let p1 = document.createElement("p")
			p1.innerText = json.hits[i].result.artist_names + " - " + json.hits[i].result.full_title
			card.appendChild(p1)
			let i1 = document.createElement("img")
			i1.src = json.hits[i].result.header_image_url
			i1.alt= json.hits[i].result.full_title
			card.appendChild(i1) 

			str.appendChild(card)
		}
	}
	)
	.catch(err => console.error(err))	
	
}



