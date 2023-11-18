import { model, Schema } from "mongoose";

const mensalidadeSchema = new Schema(
  {
    socio: { type: Schema.Types.ObjectId, ref: 'Socio' },
    mes: { type: Number },
    valor:{type: Number},
    status: {type: Boolean}
    
  },
  {
    timestamps: true,
  }
);

export const mensalidadeModel = model("Mensalidade", mensalidadeSchema);
