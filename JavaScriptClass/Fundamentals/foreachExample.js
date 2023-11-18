const elements = ['mauricio', 'joao', 'rafael', 'ricardo', 'maria'];

function showname(element) {
    console.log(`name: ${element} - length: ${element.length}`);
}

elements.forEach(showname);