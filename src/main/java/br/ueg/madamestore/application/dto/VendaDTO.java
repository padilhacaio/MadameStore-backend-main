package br.ueg.madamestore.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Entidade de transferĂȘncia de Venda")
public @Data
class VendaDTO implements Serializable {

    @ApiModelProperty(value = "id da Venda")
    private Long id;

    @ApiModelProperty(value = "nome do Produto")
    private List<ProdutoDTO> produto;

    @ApiModelProperty(value = "valor venda")
    private String valorTotal;


    @ApiModelProperty(value = "Data de Venda")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate dataVenda;

    @ApiModelProperty(value = "quantidade do Produto")
    private String quantidade;

}
