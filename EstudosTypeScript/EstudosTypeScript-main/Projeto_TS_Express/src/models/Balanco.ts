import { model, Schema } from "mongoose";
import { EntradaModel } from "./Entrada";


const balancoSchema = new Schema(
    { 
         
      mes: { type: String },
      valor_total:{type: Number},
      entradas: [{ type: Schema.Types.ObjectId, ref: 'Entrada' }],
      saidas: [{ type: Schema.Types.ObjectId, ref: 'Saida' }],
      
      
    },
    {
      timestamps: true,
    }
  );



export const BalancoModel = model("Balanco", balancoSchema);