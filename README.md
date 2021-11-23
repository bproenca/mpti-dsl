## Introdução

Muitos usuários de editores de artigos online tipo LaTex  sentem dificuldade na utilização de suas sintaxes, os LaTex’s prometem uma linguagem de marcação capaz de converter textos organizados em em tags e comandos em textos já formatados, fazendo com que o usuário pare de se preocupar com a formatação (visual) do artigo. Na construção de um artigo para publicação em uma página, o usuário teria que ter prévio conhecimento de HTML e suas tags e seus estilos CSS. Diante tal dificuldade nossa DSL propõe um mecanismo de escrita simplificada para artigos publicados em páginas web, com saída em HTML, de maneira mais simples.

### Como seria uma solução sem usar a DSL proposta?

Sem usar a DSL o usuário teria que dominar bem a linguagem de marcação HTML e a linguagem de estilo CSS ou algum framework de programação web, ou ainda assim utilizar de serviços de terceiros como wordpress, wix e outros editores de páginas

## Vantagens

* Com a utilização da DSL o usuário não vai precisar ter domínio das linguagens HTML ou CSS
* O usuário não precisará preocupar-se com formatação do seu artigo, pois a mesma será abstraída
* A compilação da DSL ajuda o usuário a identificar possíveis erros durante a escrita
* Evitar escrita de “boilerplate code”

Na imagem abaixo podemos ver o quão mais simples fica a escrita da DSL em comparação com HTML:  

![DSL Result](/images/dsl_html_comparison.jpg)

## Exemplo DSL

```
Article {
	Section (title = "Introduction to Xtext", size=1) {
		Paragraph {
			"Xtext is a framework for development of programming languages and domain-specific languages. Xtext is a framework for development of programming languages and domain-specific languages. Xtext is a framework for development of programming languages and domain-specific languages." 
		}		
		Paragraph {
			"As a new result you get a full infrastructure, including parser, linker, typechecker, compiler as well as editing support for Eclipse, any editor that supports the Language Server Protocol and your favorite web browser."
		}
		Table {
			Header{"Name" "Age" "E-mail"}
			Row {"Joao Silva" "45" "joao@email.com"}
			Row {"Maria Oliveira" "28" "maria@email.com"} 
		}
	}
	Section (title="Easy To Learn" , size = 3 ) {
		Paragraph(color = blue) {
			"Xtext is designed to onboard you smoothly. Simple languages are easily done within minutes. Yet Xtext is flexible enough to build fully-featured, statically-typed programming languages." 
		}		
	}
	Section (title="High Quality",size=3) {
		Paragraph ( color = green ) {
			"The CORE framework has been in development for eight years and is used throughout the world in many research and industry projects and even commercial products." 
		}		
	}
	Section (title="Details about Xtext") {
		Paragraph {
			"As result you get a full infrastructure, including parser, linker, typechecker, compiler as well as editing support for Eclipse, any editor that supports the Language Server Protocol and your favorite web browser."
		}
	}		
	References {
		www.eclipse.org
		ufrb.edu.br
		sigaa.ufrn.br
		hub.docker.com
	}
	
}
```

Aqui podemos ver o resuldado (renderização) do HTML escrito com a DSL:

![DSL Result](/images/dsl_html_result.jpg)

## Principais arquivos

* `HtmlModel.xtext` Definição gramática da linguagem
* `HtmlModelGenerator.xtend` Gerador código (transforma DSL em HTML)
* `HtmlModelValidator.java` Regras de validação (errors/warnings) da linguagem
* `HtmlModelParsingTest.xtend` Teste unitário da linguagem

