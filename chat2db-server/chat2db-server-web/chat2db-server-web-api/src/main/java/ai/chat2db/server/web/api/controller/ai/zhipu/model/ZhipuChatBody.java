// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package ai.chat2db.server.web.api.controller.ai.zhipu.model;

import ai.chat2db.server.web.api.controller.ai.baichuan.model.BaichuanChatMessage;
import ai.chat2db.server.web.api.controller.ai.fastchat.model.FastChatCompletionsUsage;
import ai.chat2db.server.web.api.controller.ai.fastchat.model.FastChatMessage;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * The representation of a single prompt completion as part of an overall completions request. Generally, `n` choices
 * are generated per provided prompt with a default value of 1. Token limits and other settings may limit the number of
 * choices generated.
 */
@Data
public final class ZhipuChatBody {

    /*
     * The log probabilities model for tokens associated with this completions choice.
     */
    @JsonProperty(value = "choices")
    private List<FastChatMessage> choices;

    @JsonProperty(value = "usage")
    private FastChatCompletionsUsage usage;

}