package com.suayip.dto.request;

import lombok.*;

@Builder // Builder, bir sınıftan nesne türetmek için özel oluşturulmuş bir method
@Data // Data,get, set methodlarını tanımlar
@NoArgsConstructor // Parametresiz constructor tanımlar
@AllArgsConstructor // 1....n kadar olan tüm parametreli constructorları tanımlar
public class MovieCommentCreateRequestDto {
    private Long movieId;
    private Long userId;
    private String content;
}
