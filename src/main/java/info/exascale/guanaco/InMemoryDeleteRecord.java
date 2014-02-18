/*
 * Copyright 2013-2014 the original author or authors.
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
package info.exascale.guanaco;

import java.io.IOException;
import java.util.UUID;

public class InMemoryDeleteRecord extends InMemoryRecord {

  public InMemoryDeleteRecord(UUID pageId, ByteArray key) {
    super(pageId, key);
  }

  @Override
  public ByteArray get(InMemoryPage page) {
    return page.get(this);
  }

  @Override
  public void write(StorageManager storageManager) throws IOException {
    storageManager.write(this);
  }

}