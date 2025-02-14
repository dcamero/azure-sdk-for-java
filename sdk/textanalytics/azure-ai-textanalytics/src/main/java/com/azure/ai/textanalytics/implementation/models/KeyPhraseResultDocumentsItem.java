// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The KeyPhraseResultDocumentsItem model. */
@Fluent
public final class KeyPhraseResultDocumentsItem extends KeyPhrasesDocumentResult {
    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setKeyPhrases(List<String> keyPhrases) {
        super.setKeyPhrases(keyPhrases);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setWarnings(List<DocumentWarning> warnings) {
        super.setWarnings(warnings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setStatistics(DocumentStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }
}
