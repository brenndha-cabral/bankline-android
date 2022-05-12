package dio.santander.bankline.ui.statement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dio.santander.bankline.R
import dio.santander.bankline.databinding.BankStatementItemBinding
import dio.santander.bankline.domain.Transition
import dio.santander.bankline.domain.TypeTransition

/**
 * Reference: https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=pt-br#kotlin
 */
class StatementAdapter(private val dataSet: List<Transition>) : RecyclerView.Adapter<StatementAdapter.ViewHolder>() {

    class ViewHolder(private val binding: BankStatementItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Transition) = with(binding) {
            tvDescription.text = item.description
            tvValue.text = item.value.toString()
            tvDatetime.text = item.dateHour
            val typeIcon = if (TypeTransition.INCOME == item.type) R.drawable.ic_money_in else R.drawable.ic_money_out
            ivIcon.setImageResource(typeIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BankStatementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.bind(item)
    }

    override fun getItemCount() = dataSet.size
}