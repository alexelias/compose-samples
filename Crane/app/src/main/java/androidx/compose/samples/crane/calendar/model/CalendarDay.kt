/*
 * Copyright 2020 Google, Inc.
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

package androidx.compose.samples.crane.calendar.model

import androidx.compose.getValue
import androidx.compose.mutableStateOf
import androidx.compose.setValue

enum class DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class SelectedStatus {
    NO_SELECTED,
    SELECTED,
    NON_CLICKABLE,
    FIRST_DAY,
    LAST_DAY,
    FIRST_LAST_DAY
}

class CalendarDay(val value: String, status: SelectedStatus) {
    var status by mutableStateOf(status)
}
