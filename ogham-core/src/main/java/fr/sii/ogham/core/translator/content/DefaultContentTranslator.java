package fr.sii.ogham.core.translator.content;

import fr.sii.ogham.core.exception.handler.ContentTranslatorException;
import fr.sii.ogham.core.message.content.Content;

/**
 * Apply no transformation at all. Just provide the received content as the
 * result. This may be useful to avoid null values.
 * 
 * @author Aurélien Baudet
 *
 */
public class DefaultContentTranslator implements ContentTranslator {

	@Override
	public Content translate(Content content) throws ContentTranslatorException {
		return content;
	}

}
