## Main files

* HtmlModel.xtext
* HtmlModelGenerator.xtend
* HtmlModelValidator.java
* HtmlModelParsingTest.xtend

## Example DSL File

```
Article {
	Section (title = "Introduction to Xtext", size=1) {
		Paragraph {
			"Xtext is a framework for development of programming languages and domain-specific languages. Xtext is a framework for development of programming languages and domain-specific languages. Xtext is a framework for development of programming languages and domain-specific languages." 
		}		
		Paragraph {
			"As a result you get a full infrastructure, including parser, linker, typechecker, compiler as well as editing support for Eclipse, any editor that supports the Language Server Protocol and your favorite web browser."
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
			"As a result you get a full infrastructure, including parser, linker, typechecker, compiler as well as editing support for Eclipse, any editor that supports the Language Server Protocol and your favorite web browser."
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
