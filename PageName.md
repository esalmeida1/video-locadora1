# Sistema de Gestão da Vídeo Locadora #

O objetivo deste projeto é familiarizar o aluno com um ambiente de colaboração para desenvolvimento de software.


# 1. Descrição do Problema #

O sistema de gestão da vídeo locadora deve permitir manter os clientes e a gestão de empréstimos. O sistema deve satisfazer as seguintes características:

## Requisitos funcionais. ##

REQ01 - Gestão de clientes - O sistema deve permitir o cadastro de clientes da vídeo locadora.

REQ02 - Gestão de filmes - O sistema deve permitir o cadastro de filmes para empréstimo.

REQ03 - Gestão de empréstimos - O sistema deve permitir o empréstimo e a abaixa dos filmes emprestados.

REQ04 - Gestão de backup - O sistema deve permitir o backup periódico das informações.

REQ05 – Segurança - O sistema deve permitir o acesso somente para usuários autorizados.

## Requisitos não funcionais. ##

RNF01 – O sistema deve oferecer uma interface padronizada, com dicas de campo e help-online

RNF02 – Em uma falha de hardware (por exemplo, acesso ao disco) a instalação do sistema operacional, do aplicativo e recuperação do backup deve ser realizada em 2h.

RNF03 – A conclusão da transação de registro de empréstimo deve ser concluída em no máximo 5s.

RNF04 – A conclusão da transação de registro da devolução deve ser concluída em no máximo 5s.

RNF05 – O módulo de acesso a dados deve permitir a modificação do sistema gerenciador de banco de dados de acordo com as necessidades do cliente. Esta modificação deve ser realizada por um analista em no máximo 4h.

RNF06 – O sistema deve ser estruturado em camadas e permitir o teste de cada camada utilizando API´s. O teste unitário deve cobrir 100% do código, o teste de integração deve cobrir 100% dos métodos públicos que permitem a integração entre as camadas.