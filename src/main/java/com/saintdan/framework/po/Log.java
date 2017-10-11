package com.saintdan.framework.po;

import com.saintdan.framework.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Log, record users' behavior.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/27/15
 * @since JDK1.8
 */
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Log {
  @Id private String id;
  private String ip;
  private String usr;
  private String clientId;
  private String path;
  private OperationType operationType;
  private long createdAt;
}
