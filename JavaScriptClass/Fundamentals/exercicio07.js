// Crie um objeto chamado estoque que armazene informações sobre produtos disponíveis em uma loja. Cada produto deve ter as propriedades nome, preco e quantidade. Em seguida, crie uma função chamada verificarEstoque que recebe o nome de um produto como parâmetro e retorna uma mensagem informando se o produto está disponível em estoque e quantas unidades estão disponíveis.
const prompt = require('prompt-sync')();

let estoque = [];
let produto = {};

let option = Number(prompt('Digite a quantidade de produtos que deseja cadastrar: '));
for(let i = 0; i < option; i++){
    produto  = {};
    produto.nome = prompt('Digite o nome do produto: ');
    produto.preco = Number(prompt('Digite o preco do produto: '));
    produto.quantidade = Number(prompt('Digite a quantidade do produto: '));
    estoque.push(produto);
}

console.log(estoque);

function verificarEstoque(nome) {
    for(let i = 0; i < estoque.length; i++) {
        if(estoque[i].nome === nome) {
            console.log(`O produto ${nome} está disponível em estoque e tem ${estoque[i].quantidade} unidades disponíveis.`);
        } 
    }
}

let produto_nome= prompt('Digite o nome do produto que deseja verificar: ');
verificarEstoque(produto_nome);