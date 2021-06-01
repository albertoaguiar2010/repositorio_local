

function clicou(){
    document.getElementById("agradecimento").innerHTML="<b>Obrigada por clicar</b>";
    //console.log(document.getElementById("agradecimento"));
    //alert("Obrigado po cLicar")
}

function redirecionar(){
    window.open("https://digitalinnovation.one/");
 //   window.location.heref = "https://digitalinnovation.one/";
}

function trocar(elemento){
   // document.getElementById("mousemove").innerHTML = "Obrigado por passar o mouse";
    //alert("tocar texto");
    elemento.innerHTML = "Obrigado por passar o mouse";
}

function voltar(elemento){
    //document.getElementById("mousemove").innerHTML = "Passe o mouse aqui";
    elemento.innerHTML = "Passe o mouse aqui";
}

function load(){
    alert("pagina carregada");
}

function funcaoChange(elemento){
    console.log(elemento.value)
}

/*
function soma(n1, n2){
    return n1 + n2;
}
*/
/*
var validar;
function validaIdade(idade){
    var validar;
    if (idade >=18){
        validar = true
    }else{
        validar = false
    }
    return validar;
}
var idade = prompt("qual sua idade")
validarIdade(idade)
console.log(validar);
*/
/*
function soma(n1, n2){
    return n1 + n2;
}

function setReplace(frase, nome, novo_nome){
  return frase.replace( nome, novo_nome)
}
alert(soma(5,10));
alert(setReplace("vai japão", "Japão", "Brasil"));
*/

/*
var d = new Date();
alert(d.getDay());
alert(d.getHours());
alert(d.getMinutes());
*/
/*
var count;
for(count=0; count<= 5; count++){
    alert(count);
}
*/
/*
var count = 0;
while (count <= 5){
    console.log(count);
    count++;
};
*/
/*
var idade = prompt("Qual sua idade")
var idade=18;
if (idade >= 18){s
    alert("maior de idade");
    }else{
        alert("menor de idade");
    };

*/
/*
var frutas =[{nome:"maçã",cor:"vermelha"},{nome:"uva",cor:"roxa"}]
console.log(frutas);      ,lm000000
0alert(frutas[1].nome);
*/
/*
var fruta ={nome:"maçã",cor:"vermelha"}
console.log(fruta.nome);
alert(fruta.cor);
*///

//var lista =["maçã","péra","laranja"];
//lista.push("uva");
//lista.pop();

//console.log(lista)
//console.log(lista.toString())
//console.log(lista.join("-"))

//var nome = "Alberto Aguiar";
//var n1 = 5;
//var n2 = 3;
//var frase = "Japão é o melhor time do mundo";
//alert(nome +" tem " + idade + "anos");
//alert(n1 * n2);
//console.log(nome);
//console.log(idade + idade1);
//console.log(frase.tolowercase());
//alert(frase.replace("Japão","Brasil"));