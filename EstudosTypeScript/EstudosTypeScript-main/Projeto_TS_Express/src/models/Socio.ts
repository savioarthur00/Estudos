import { model, Schema } from "mongoose";
import { mensalidadeModel } from "./Mensalidade";

const socioSchema = new Schema(
  {
    name: { type: String },
    forma_pagamento: { type: String },
    status: { type: String },
    mensalidades: [{ type: Schema.Types.ObjectId, ref: 'Mensalidade' }],
  },
  {
    timestamps: true,
  }
);

socioSchema.pre('save', async function (next) {
  if (this.isNew) {
    const mensalidades = [];

    for (let i = 1; i <= 12; i++) {
      const mensalidade = new mensalidadeModel({ socio: this._id, mes: i, valor: 70, status:false});
      await mensalidade.save();
      mensalidades.push(mensalidade._id);
    }

    this.mensalidades = mensalidades;
  }

  next();
});

export const SocioModel = model("Socio", socioSchema);
