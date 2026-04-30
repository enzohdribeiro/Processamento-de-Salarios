# Exercício: Sistema de Folha de Pagamento (Herança e Polimorfismo)

Este módulo implementa um sistema de gerenciamento de funcionários, focado em demonstrar como a especialização de classes e o polimorfismo facilitam a manutenção e expansão de software.

### 1. Modelo Abstrato (`Funcionario.java`)
A classe pai é definida como `abstract` por ser um conceito genérico. No mundo real, você não contrata um "Funcionário", você contrata um "Gerente" ou um "Desenvolvedor".
- **Atributos `protected`**: Escolhemos `protected` para `nome` e `salarioBase` para que as classes filhas possam realizar cálculos matemáticos diretamente com esses valores, sem precisar chamar métodos `get`, mantendo o encapsulamento contra classes externas.
- **Contratos Abstratos**: Definimos `public abstract double calcularPagamento()`. Isso garante que qualquer classe que herde de funcionário **seja obrigada** a implementar sua própria lógica de salário.

### 2. Especializações (As Classes Filhas)
- **Gerente.java**: 
    - Utilizamos um **bloco de inicialização** para definir o `cargo` e o `bonusFixo` (20%). 
    - O `cargo` foi definido como `static` para demonstrar que todos os objetos dessa classe compartilham a mesma identificação, otimizando o uso de memória.
- **Desenvolvedor.java**:
    - Implementa o cálculo base com 10% de bônus.
    - **Diferencial (Sobrecarga)**: Criamos um segundo método `calcularPagamento(double valorProjeto)`. Isso permite que o sistema trate desenvolvedores que recebem comissões por entregas específicas sem alterar a estrutura do salário base.

### 3. O Controlador de Saída (`Impressora.java`)
Esta classe usa o **Polimorfismo** como vantagem:
- O método `imprimeFuncionario(Funcionario funcionario)` recebe qualquer objeto que "seja um" Funcionário. 
- Graças à **Ligação Tardia (Late Binding)** do Java, quando chamamos `funcionario.calcularPagamento()`, o sistema identifica automaticamente se deve usar a regra do Gerente ou do Desenvolvedor em tempo de execução.

### 4. Fluxo de Execução (`Main.java`)
No ponto de entrada, instanciamos objetos específicos e os passamos para a `Impressora`. O teste valida:
1. O cálculo correto de diferentes bônus.
2. A resposta do sistema à sobrecarga (passando ou não o valor de um projeto).
3. A segurança de dados (verificação de salário base zerado).

---

## Conceitos de POO Demonstrados

| Conceito | Aplicação no Código |
| :--- | :--- |
| **Abstração** | Uso de classe e métodos `abstract` em `Funcionario`. |
| **Herança** | `Gerente` e `Desenvolvedor` estendendo as propriedades de `Funcionario`. |
| **Sobrescrita (@Override)** | Cada classe filha redefinindo `calcularPagamento()` à sua maneira. |
| **Sobrecarga (Overload)** | Dois métodos com o mesmo nome em `Desenvolvedor`, mas parâmetros diferentes. |
| **Encapsulamento** | Uso de modificadores `protected`, `private` e `public` para controle de acesso. |
