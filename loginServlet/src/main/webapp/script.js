let characters = [
    {
        name: "Honda-suv",
        houseName: "GRYFFINDOR",
        actor: "BY DANIEL REDCLIFFE",
        imageSrc: "https://media.npr.org/assets/img/2021/04/23/gettyimages-1232412494_wide-8c2b57719b99a13be04b288c27d7894fdfebbe8c.jpg?s=1400"
    },
    {
        name: "Ford",
        houseName: "GRYFFINDOR",
        actor: "BY EMMA WATSON",
        imageSrc: "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.qwzg2vLDGTf0KcpCzEVEnwHaEh%26pid%3DApi&f=1&ipt=a74d7359e3b3b07fd07db1f324f50fc5aeb040e5848037879ec1d83944abda2c&ipo=images"
        
    },
    {
        name: "Suzuki",
        houseName: "GRYFFINDOR",
        actor: "BY RUPERT GRINT",
        imageSrc: "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fs1.cdn.autoevolution.com%2Fimages%2Fnews%2Fgallery%2F2017-suzuki-ignis-locks-down-on-paris-sx4-s-cross-facelift-still-unsightly_17.jpg&f=1&nofb=1&ipt=8e6e0f8c3654d925b1db367bcf6977154fa7941115149e748e18c461e0c88b20&ipo=images"
        
    }
];

function createCharacterCard(characterData) {
    let characterCard = document.createElement("div");
    characterCard.classList.add("character-cart");

    characterCard.classList.add(characterData.houseName.toLowerCase());

    // Modify styles for specific character cards
    characterCard.style.width = "250px";
    characterCard.style.borderRadius = "12px";

    let profileImg = document.createElement("img");
    profileImg.classList.add("character-image");
    profileImg.setAttribute("src", characterData["imageSrc"]);
    profileImg.setAttribute("alt", characterData["name"]);
    profileImg.setAttribute("width", "100%");

    let characterName = document.createElement("h2");
    characterName.classList.add("character-name");
    characterName.innerText = characterData["name"];

    let houseName = document.createElement("p");
    houseName.classList.add("house-name");
    houseName.innerText = characterData["houseName"];

    let actor = document.createElement("p");
    actor.classList.add("actor");
    actor.innerText = characterData.actor;

    characterCard.append(profileImg, characterName, houseName, actor);
    document.getElementById("cards-list").appendChild(characterCard);

    if (characterData.name === "HERMIONE GRANGER") {
        characterCard.classList.add("hermione-granger");
    }
}

// Loop through the characters array and create cards
for (let i = 0; i < characters.length; i++) {
    createCharacterCard(characters[i]);
}