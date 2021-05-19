package br.com.fatecararas.model;

public class Contato {
    private String nome, apelido, email, telefone, end, empresa, observacoes;

    public Contato(String nome, String apelido, String email, String telefone, String end, String empresa, String observacoes) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
        this.end = end;
        this.empresa = empresa;
        this.observacoes = observacoes;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public Contato setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getApelido() {
        return apelido;
    }

    public Contato setApelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contato setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Contato setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public Contato setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Contato setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Contato setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
}
