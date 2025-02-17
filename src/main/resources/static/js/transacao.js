$(document).ready(function () {
    $("#transacaoForm").submit(function (event) {
        event.preventDefault(); // Impede o envio padrão do formulário
        salvarTransacao();
    });
});

function salvarTransacao() {
    let formData = {
        tipo: $("select[name='tipo']").val(),
        valor: $("input[name='valor']").val(),
        data: $("input[name='data']").val(),
        categoria: $("select[name='categoria']").val(),
        descricao: $("textarea[name='descricao']").val(),
        formaPagamento: $("select[name='formaPagamento']").val(),
        usuarioId: obterUsuarioId() // Obtém o ID do usuário autenticado
    };

    $.ajax({
        type: "POST",
        url: "/transacoes/salvar", // Altere para a URL correta do seu backend
        contentType: "application/json",
        data: JSON.stringify(formData),
        success: function (response) {
            $("#mensagem")
                .removeClass("d-none alert-danger")
                .addClass("alert-success")
                .text("Transação salva com sucesso!");
            
            setTimeout(() => {
                window.location.href = "/"; // Redireciona para a página inicial ou lista de transações
            }, 2000);
        },
        error: function (xhr) {
            let errorMsg = xhr.responseJSON?.message || "Erro ao salvar a transação!";
            $("#mensagem")
                .removeClass("d-none alert-success")
                .addClass("alert-danger")
                .text(errorMsg);
        }
    });
}

// Função para obter o ID do usuário autenticado (exemplo)
function obterUsuarioId() {
    let usuario = localStorage.getItem("usuario");
    return usuario ? JSON.parse(usuario).id : null;
}
