package com.isaquesoares.financeapp.resources;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaquesoares.financeapp.model.Transacao;
import com.isaquesoares.financeapp.model.User;
import com.isaquesoares.financeapp.model.dto.TransacaoDTO;
import com.isaquesoares.financeapp.services.TransacaoService;
import com.isaquesoares.financeapp.services.UserService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoResource {

    @Autowired
    private TransacaoService transacaoService;

    @Autowired
    private UserService userService;

    @PostMapping("/salvar")
    public ResponseEntity<Map<String, String>> salvarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
        Map<String, String> response = new HashMap<>();

        User user = userService.findById(transacaoDTO.getUserId());
        if (user == null) {
            response.put("message", "Erro: Usuário não encontrado!");
            return ResponseEntity.badRequest().body(response);
        }

        Transacao transacao = new Transacao();
        transacao.setTipo(transacaoDTO.getTipo());
        transacao.setValor(transacaoDTO.getValor());
        transacao.setData(transacaoDTO.getData());
        transacao.setCategoria(transacaoDTO.getCategoria());
        transacao.setDescricao(transacaoDTO.getDescricao());
        transacao.setFormaPagamento(transacaoDTO.getFormaPagamento());
        transacao.setUsuario(user);

        transacaoService.salvar(transacao);
        response.put("message", "Transação cadastrada com sucesso!");
        return ResponseEntity.ok(response);
    }
}
