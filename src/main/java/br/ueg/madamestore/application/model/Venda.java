package br.ueg.madamestore.application.model;

import br.ueg.madamestore.application.configuration.Constante;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "TBL_VENDA", schema = Constante.DATABASE_OWNER)
@EqualsAndHashCode()
@SequenceGenerator(name = "TBL_S_VENDA", sequenceName = "TBL_S_VENDA", allocationSize = 1, schema = Constante.DATABASE_OWNER)
public @Data
class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TBL_S_VENDA")
    @Column(name = "ID_VENDA", nullable = false)
    private Long id;


    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ItemVenda> itemVenda;

    @Column(name="VALORTOTAL", nullable = false)
    private Double valorTotal;

    @Column(name = "DATA_VENDA",nullable = false)
    private LocalDate dataVenda;

    @Column(name="QUANTIDADE", nullable = false)
    private Integer quantidade;



}
