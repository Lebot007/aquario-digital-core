# Missão Aquário Digital

## Módulo de Controle de Qualidade da Água

Projeto acadêmico da disciplina Gestão e Qualidade de Software.

**Responsável:** João Vitor Alves Rodrigues — RA 32513480

O módulo monitora continuamente os níveis de pH e a temperatura da água, emitindo alertas quando os parâmetros saem dos limites seguros.

## Camadas do ambiente

- **develop:** ambiente de desenvolvimento e integração das funcionalidades.
- **stage:** ambiente de homologação para validação e revisão antes da publicação.
- **main:** ambiente de produção, contendo somente versões aprovadas e prontas para entrega.

## Critérios monitorados

- pH ideal entre **6,8 e 7,6**.
- Temperatura segura entre **22,0 °C e 28,0 °C**.

## Fluxo de versionamento

`feature/*` → `develop` → `stage` → `main`

Cada promoção deve ocorrer por Pull Request com revisão e validação local.