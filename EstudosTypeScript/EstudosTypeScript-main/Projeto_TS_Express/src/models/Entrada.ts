import { model, Schema } from "mongoose";

const entradaSchema = new Schema(
  {
    balanco: { type: Schema.Types.ObjectId, ref: 'Balanco' },
    mes_referencia: { type: String },
    tipo: {type: String},
    descricao: {type:String},
    valor:{type: Number}
    
    
  },
  {
    timestamps: true,
  }
);

export const EntradaModel = model("Entrada", entradaSchema);
