# 👨‍🏫 Java POO - Criando um Bootcamp 🚀

Projeto desenvolvido com foco em **Programação Orientada a Objetos (POO) em Java**, simulando a criação e gerenciamento de um **Bootcamp de tecnologia**.

---

##  Conecte-se comigo
 [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/diego-camargo-88aa34294/)

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Diegodccs)

## 📚 Sobre o Projeto

Este projeto simula a estrutura de um bootcamp, onde:

- Desenvolvedores se inscrevem e participam de **cursos e mentorias**;
- Cada conteúdo tem **carga horária, descrição e título**;
- A plataforma rastreia o **progresso e XP** (experiência) de cada dev.

O objetivo é aplicar os pilares da POO:  
**Abstração, Encapsulamento, Herança e Polimorfismo**.

---

## 🧩 Funcionalidades

✔️ Cadastro de cursos e mentorias  
✔️ Inscrição de desenvolvedores no bootcamp  
✔️ Progresso do aluno ao concluir conteúdos  
✔️ Cálculo automático de XP por atividade

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 21**
- 🧰 IDE: IntelliJ 
- 📦 Paradigma: Programação Orientada a Objetos

---

## 🔍 Estrutura POO

- `Bootcamp.java`
- `Dev.java`
- `Curso.java` *(herda de Conteudo)*
- `Mentoria.java` *(herda de Conteudo)*
- `Conteudo.java` *(classe abstrata)*

---

## 🧪 Exemplo de Uso

```java
Curso curso1 = new Curso("Java POO", "Aprenda os pilares da OOP", 8);
Mentoria mentoria = new Mentoria("Mentoria Java", "Tira-dúvidas ao vivo", LocalDate.now());

Bootcamp bootcamp = new Bootcamp();
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
[](url)bootcamp.getConteudos().add(mentoria);

Dev devDiego = new Dev();
devDiego.inscreverBootcamp(bootcamp);
devDiego.progredir();
