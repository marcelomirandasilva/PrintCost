# PrintCost Pro 🖨️💰

![Status](https://img.shields.io/badge/STATUS-EM_DESENVOLVIMENTO-yellow)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![License](https://img.shields.io/badge/License-MIT-blue)

> **SaaS de Precificação Inteligente para Makers e Impressão 3D.**

---

## 📖 Sobre o Projeto

O **PrintCost Pro** é uma API desenvolvida para resolver a dor de cabeça de quem trabalha com impressão 3D: **a precificação correta**. 

Diferente de calculadoras simples que apenas multiplicam o peso pelo custo do filamento, este sistema utiliza algoritmos específicos para considerar:
- Depreciação de máquinas (FDM e Resina).
- Custo de energia elétrica (kWh) baseado no tempo real de impressão.
- Custos ocultos de pós-processamento (álcool isopropílico, lixas, verniz).
- **Leitura automática de arquivos G-Code e CTB** para extração de metadados.

Este projeto também serve como case de estudo de uma migração de arquitetura de sistemas PHP/Laravel para o ecossistema **Java Enterprise**.

### 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17
* **Framework:** Spring Boot 4
* **Banco de Dados:** H2 (Dev) / PostgreSQL (Prod)
* **Build Tool:** Maven
* **Design Patterns:** Strategy (para cálculos polimórficos de custos)
* **Outros:** Lombok, Spring Data JPA, Bean Validation.

---

## 🚀 Features (Funcionalidades)

- [x] **Cadastro de Impressoras:** Suporte a FDM (Filamento) e SLA/DLP (Resina).
- [x] **Gestão de Materiais:** Controle de estoque e custo por grama/ml.
- [ ] **Smart Import:** Leitura de arquivos `.gcode` (via Regex) e `.ctb` (via Binary Parsing) para extração automática de tempo e peso.
- [ ] **Orçamento PDF:** Geração automática de orçamento para o cliente final.
- [ ] **Dashboard:** Análise de lucro mensal e gastos com energia.

---

## 📦 Como Rodar o Projeto

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Maven instalado (ou usar o wrapper `mvnw` incluso).
* Git instalado.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/marcelomirandasilva/printcost.git