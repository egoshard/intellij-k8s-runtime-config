/*
 * Copyright (c) 2019. Matt Trefethen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.egoshard.intellij.k8s;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration settings wrapper
 */
public class ConfigSettings {

    private final boolean enabled;
    private final List<ConfigEntry> entries;

    public ConfigSettings(boolean enabled, List<ConfigEntry> entries) {
        this.enabled = enabled;
        this.entries = entries;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<ConfigEntry> getEntries() {
        return new ArrayList<>(entries);
    }

}

