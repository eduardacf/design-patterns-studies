- Criado um sistema de envio *notificação* que suporta apenas **SMS e Email** (apenas escrever no terminal o tipo de notificação junto com a mensagem)

- Existe uma classe que representa um cliente apenas com *nome,email e telefone*.

- Existe uma classe responsável por apenas montar uma mensagem(**Hello + nome do cliente**) e usar uma classe de notificação para enviar.

- O padrão Strategy foi usado para definir **SMS e Email**.

- **Regra**: o sistema valida se o cliente possui  telefone preenchido enviar por telefone caso contrario enviar por email(email é obrigatório). 
